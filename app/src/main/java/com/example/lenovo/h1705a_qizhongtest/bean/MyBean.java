package com.example.lenovo.h1705a_qizhongtest.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/29.
 */
public class MyBean {
    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"璋佸姩浜嗘垜鐨勫啺绠憋紒","hashId":"DDE51B6C09E1557D6542627755901308","unixtime":1418967626,"updatetime":"2014-12-19 13:40:26","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715871&di=66a99bc6b3ae7c1f3a1a96abbd6d0fe9&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff603918fa0ec08fae0b1528f52ee3d6d55fbda61.jpg"},{"content":"杩欓奔鎴戞\u20ac庝箞鎶撲笉鍒帮紵","hashId":"B0C3ABBEBBE0A6EA5B8FE04E27215FBC","unixtime":1418965236,"updatetime":"2014-12-19 13:00:36","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715872&di=7399b2f9f788dbf99243abbc3bffe4c2&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fb17eca8065380cd708ae52d1aa44ad345982815e.jpg"},{"content":"鏈熸湯鑰冭瘯浜嗭紝閫佸悇浣嶅鐢熷厷涓\u20ac寮犲浘","hashId":"B9EBF01A3C718DABB4C166356CC839A8","unixtime":1418964026,"updatetime":"2014-12-19 12:40:26","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715873&di=fb80d0116d5d016ebe8480a0acd1133a&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff7246b600c3387447d2db0ff5b0fd9f9d62aa04d.jpg"},{"content":"浜戦洦杩囧悗锛岀敺鍙嬫姳鐫\u20ac鎴戣鈥滄兂鎯冲挶淇╄繕鐪熸槸鏈夌紭鈥濄\u20ac\u20ac銆\u20ac鈥滃彲涓嶆槸鍚楋紝鍜嬩咯灏忓鍚屾牎锛屽垵涓悓鐝紝楂樹腑鍚屾锛屽ぇ瀛﹀悓瀵濃\u20ac�","hashId":"62287B57ED97B8A06861ADA51D921CEB","unixtime":1418962826,"updatetime":"2014-12-19 12:20:26","url1":"http://p9.pstatp.com/origin/19fc00007f27b4c9ead9"},{"content":"鑷粠鏈変簡杩欎釜瑁呯疆锛屽濡堝啀涔熶笉鎷呭績鎴戠殑璧峰簥浜嗭紒","hashId":"E005FFD7C7A9C80F1C0E8EEF3F44DB71","unixtime":1418961624,"updatetime":"2014-12-19 12:00:24","url1":"https://cdn.kaishuhezi.com/kstory/story/image/03913a1d-5b97-48b6-9f0b-d4b8339cb480.jpg"},{"content":"閭ｄ簺绁為Μ鏈夐將浠绘\u20acх殑閮藉急鐖嗕簡锛屽墠骞惧ぉ鍦ㄩ妧琛岃睛鐞嗘キ鍕欙紝涓\u20ac鍝ュ\u20ac戣蛋鍒版珒妾紝鍝ュ\u20ac戯細鈥滅郸鎴戝彇30钀紝璎濊瑵锛佲\u20ac濅竴鏈冨厭宸ヤ綔浜哄摗灏辫锛氣\u20ac滃厛鐢燂紝灏嶄笉璧凤紒鍗\u2032笂椁橀涓嶈冻銆傗\u20ac濆彧瑕嬮\u20ac欏摜鍊戞偁鎮犺鎳疯！鎺忓嚭鎵嬫锛氣\u20ac滄矑杈︽硶鏈夋灏辨槸浠绘\u20acэ紒锛佲\u20ac濇垜鎯宠鍝ュ\u20ac戜綘鎼跺姭灏辨惗鍔紝瑁濈棣珺锛�","hashId":"E3070767518CB4DFEA708DCCC332EE2F","unixtime":1418960433,"updatetime":"2014-12-19 11:40:33","url1":"http://p1.pstatp.com/origin/19fc00007f26052f7da0","url2":"http://p3.pstatp.com/origin/19fb00025352da4724b1"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 璋佸姩浜嗘垜鐨勫啺绠憋紒
             * hashId : DDE51B6C09E1557D6542627755901308
             * unixtime : 1418967626
             * updatetime : 2014-12-19 13:40:26
             * url1 : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715871&di=66a99bc6b3ae7c1f3a1a96abbd6d0fe9&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff603918fa0ec08fae0b1528f52ee3d6d55fbda61.jpg
             * url2 : http://p3.pstatp.com/origin/19fb00025352da4724b1
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url1;
            private String url2;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUrl1() {
                return url1;
            }

            public void setUrl1(String url1) {
                this.url1 = url1;
            }

            public String getUrl2() {
                return url2;
            }

            public void setUrl2(String url2) {
                this.url2 = url2;
            }
        }
    }



}
