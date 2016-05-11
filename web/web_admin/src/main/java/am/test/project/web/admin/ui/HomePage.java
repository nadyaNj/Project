package am.test.project.web.admin.ui;


import am.test.project.web.facade.user.UserFacade;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class HomePage extends WebPage{

	@SpringBean
	private UserFacade userFacade;

	public HomePage() {

		add(new Label("msg", "hdagjs"));


    }
}
