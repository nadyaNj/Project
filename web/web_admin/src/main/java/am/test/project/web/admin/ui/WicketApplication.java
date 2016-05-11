package am.test.project.web.admin.ui;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;


/**
 * Application object for web application.
 */
public class WicketApplication extends WebApplication
{
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}


	@Override
	public void init()
	{
		super.init();

		// add your configuration here
	}
}
