package codeForces.v158

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class CdAndPwdTest {
    @Test
    fun `pwd at root returns slash`() {
        assertThat(CdAndPwd.solve("pwd", "/", "")).isEqualTo("/")
    }

    @Test
    fun `cd at -home-vasya returns -home-vasya-`() {
        assertThat(CdAndPwd.solve("cd", "/", "/home/vasya")).isEqualTo("/home/vasya/")
    }

    @Test
    fun `cd dot dot returns one folder up`() {
        assertThat(CdAndPwd.solve("cd", "/home/vasya", "..")).isEqualTo("/home/")
    }
}