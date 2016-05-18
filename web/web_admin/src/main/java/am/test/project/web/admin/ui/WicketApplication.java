package am.test.project.web.admin.ui;

import am.test.project.web.admin.ui.child.login.LoginPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import java.io.Serializable;


/**
 * Application object for web application.
 */
public class WicketApplication extends WebApplication implements Serializable{
	private static final long serialVersionUID = 1312603254006820118L;

	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return LoginPage.class;
	}


	@Override
	public void init()
	{
		super.init();

		mountPages();
	}

	private void mountPages() {
        /*Login page*/
		mountPage("/login", LoginPage.class);
	}
}
