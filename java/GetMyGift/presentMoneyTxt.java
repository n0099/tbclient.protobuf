package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class presentMoneyTxt extends Message {
    public static final String DEFAULT_TXT = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String txt;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<presentMoneyTxt> {
        public String txt;
        public String url;

        public Builder() {
        }

        public Builder(presentMoneyTxt presentmoneytxt) {
            super(presentmoneytxt);
            if (presentmoneytxt == null) {
                return;
            }
            this.txt = presentmoneytxt.txt;
            this.url = presentmoneytxt.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public presentMoneyTxt build(boolean z) {
            return new presentMoneyTxt(this, z);
        }
    }

    public presentMoneyTxt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.txt;
            if (str == null) {
                this.txt = "";
            } else {
                this.txt = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.txt = builder.txt;
        this.url = builder.url;
    }
}
