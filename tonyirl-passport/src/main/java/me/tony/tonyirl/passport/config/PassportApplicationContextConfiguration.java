package me.tony.tonyirl.passport.config;

import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.web.config.CasSupportActionsConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * Created by tony on 2017/3/16.
 */
@EnableConfigurationProperties(CasConfigurationProperties.class)
@Import({CasSupportActionsConfiguration.class})
public class PassportApplicationContextConfiguration {

}
