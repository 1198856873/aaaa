package com.example.lenovo.h1705a_qizhongtest.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/29.
 */
public class TwoBean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"璋佸姩浜嗘垜鐨勫啺绠憋紒","hashId":"DDE51B6C09E1557D6542627755901308","unixtime":1418967626,"updatetime":"2014-12-19 13:40:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512967778547&di=279f3fbe17e44cf9fbbd7dcc7c609940&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20141128%2Flushuizhudu_3495981.jpg"},{"content":"杩欓奔鎴戞\u20ac庝箞鎶撲笉鍒帮紵","hashId":"B0C3ABBEBBE0A6EA5B8FE04E27215FBC","unixtime":1418965236,"updatetime":"2014-12-19 13:00:36","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=355ae4973e31ee432f4d6d700cf01a0d&src=http://pic.baike.soso.com/p/20140708/20140708162513-1055949871.jpg"},{"content":"鏈熸湯鑰冭瘯浜嗭紝閫佸悇浣嶅鐢熷厷涓\u20ac寮犲浘","hashId":"B9EBF01A3C718DABB4C166356CC839A8","unixtime":1418964026,"updatetime":"2014-12-19 12:40:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=bc93bdbefc207f1076c0a27ab3dac8f1&src=http://imgsrc.baidu.com/baike/pic/item/8326cffc1e178a829bec9484f403738da877e8c6.jpg"},{"content":"浜戦洦杩囧悗锛岀敺鍙嬫姳鐫\u20ac鎴戣鈥滄兂鎯冲挶淇╄繕鐪熸槸鏈夌紭鈥濄\u20ac\u20ac銆\u20ac鈥滃彲涓嶆槸鍚楋紝鍜嬩咯灏忓鍚屾牎锛屽垵涓悓鐝紝楂樹腑鍚屾锛屽ぇ瀛﹀悓瀵濃\u20ac�","hashId":"62287B57ED97B8A06861ADA51D921CEB","unixtime":1418962826,"updatetime":"2014-12-19 12:20:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=1f23394b2d49e0b9da1e31be08b82621&src=http://pic6.nipic.com/20100313/1700216_170733595053_2.jpg"},{"content":"鑷粠鏈変簡杩欎釜瑁呯疆锛屽濡堝啀涔熶笉鎷呭績鎴戠殑璧峰簥浜嗭紒","hashId":"E005FFD7C7A9C80F1C0E8EEF3F44DB71","unixtime":1418961624,"updatetime":"2014-12-19 12:00:24","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=0c877df0589d7411abe2793e220d528e&src=http://pic23.nipic.com/20120809/10508666_135717287167_2.jpg"}]}
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
             * url : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512967778547&di=279f3fbe17e44cf9fbbd7dcc7c609940&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20141128%2Flushuizhudu_3495981.jpg
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
