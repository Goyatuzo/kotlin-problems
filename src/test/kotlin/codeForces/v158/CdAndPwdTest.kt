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

    @Test
    fun `cd relative path`() {
        assertThat(CdAndPwd.solve("cd", "/home/", "vasya/../petya")).isEqualTo("/home/petya/")
    }

    @Test
    fun `cd absolute path with dot dot`() {
        assertThat(CdAndPwd.solve("cd", "/home/", "/test/../a")).isEqualTo("/a/")
    }
    @Test
    fun `pwd double slash is not returned`() {
        assertThat(CdAndPwd.solve("pwd", "//", "")).isEqualTo("/")
    }
}