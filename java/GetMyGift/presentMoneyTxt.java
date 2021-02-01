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

    private presentMoneyTxt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.txt == null) {
                this.txt = "";
            } else {
                this.txt = builder.txt;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.txt = builder.txt;
        this.url = builder.url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<presentMoneyTxt> {
        public String txt;
        public String url;

        public Builder() {
        }

        public Builder(presentMoneyTxt presentmoneytxt) {
            super(presentmoneytxt);
            if (presentmoneytxt != null) {
                this.txt = presentmoneytxt.txt;
                this.url = presentmoneytxt.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public presentMoneyTxt build(boolean z) {
            return new presentMoneyTxt(this, z);
        }
    }
}
