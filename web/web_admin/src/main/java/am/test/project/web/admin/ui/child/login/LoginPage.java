package am.test.project.web.admin.ui.child.login;

import am.test.project.web.admin.ui.HomePage;
import am.test.project.web.admin.ui.user.helper.UserHelper;
import am.test.project.web.admin.ui.user.model.UserModel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;

/**
 * Created by nadya
 * DATE: 5/12/16
 * TIME: 11:23 AM
 */
public class LoginPage extends HomePage {
    private static final long serialVersionUID = -1131967617293640435L;

    private String userName;

    private String password;

    public LoginPage() {
        add(new LoginForm("loginForm"));

    }

    private class LoginForm extends Form<Void> {

        private static final long serialVersionUID = -3357687149076777708L;

        /* Dependencies */
        private UserHelper userHelper;


        /* Properties */
        private final UserModel userModel;


        public LoginForm(final String id) {
            super(id);
            userModel = new UserModel();
            initLoginForm();
        }

        private void initLoginForm() {

            final RequiredTextField<String> username = new RequiredTextField<String>("username");
            add(username);

            final PasswordTextField passwd = new PasswordTextField("password");
            add(passwd);

            userName = username.toString();
            password = passwd.toString();

            if (userName != null || password != null) {

                add(new SignIn("login", this));
            }

        }

        private class SignIn extends AjaxButton {

            private static final long serialVersionUID = 513916433161399926L;

            /*Constructor*/
            public SignIn(final String id, final Form<?> form) {
                super(id, form);
            }


            @Override
            protected void onSubmit(final AjaxRequestTarget target, final Form<?> form) {
                userHelper.getLoginUser(userName, password);
            }

            @Override
            protected void onAfterSubmit(final AjaxRequestTarget target, final Form<?> form) {

                if (userHelper.getLoginUser(userName, password) != null) {
                    continueToOriginalDestination();
                } else {
                    setResponsePage(getApplication().getHomePage());
                }

            }

            @Override
            protected void onError(final AjaxRequestTarget target, final Form<?> form) {
                target.add(form);
            }
        }
    }
}
