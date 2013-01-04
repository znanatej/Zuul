package org.devnull.client.spring

import org.devnull.client.spring.test.BaseHttpServerIntegrationTest
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ['classpath:test-zuul-with-aes-context.xml'])
class ZuulClientWithAesEncrptionIntegrationTest extends BaseHttpServerIntegrationTest {


    @Value("\${jdbc.zuul.password}")
    String password

    @Test
    void shouldInjectDecryptedValue() {
        assert password == "supersecure"
    }
}
