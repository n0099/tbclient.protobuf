package tbclient.ReSign;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SignInfo extends Message {
    public static final Integer DEFAULT_IS_SIGN_IN = 0;
    public static final String DEFAULT_SIGN_DATE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_sign_in;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String sign_date;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SignInfo> {
        public Integer is_sign_in;
        public String sign_date;

        public Builder() {
        }

        public Builder(SignInfo signInfo) {
            super(signInfo);
            if (signInfo == null) {
                return;
            }
            this.sign_date = signInfo.sign_date;
            this.is_sign_in = signInfo.is_sign_in;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignInfo build(boolean z) {
            return new SignInfo(this, z);
        }
    }

    public SignInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.sign_date;
            if (str == null) {
                this.sign_date = "";
            } else {
                this.sign_date = str;
            }
            Integer num = builder.is_sign_in;
            if (num == null) {
                this.is_sign_in = DEFAULT_IS_SIGN_IN;
                return;
            } else {
                this.is_sign_in = num;
                return;
            }
        }
        this.sign_date = builder.sign_date;
        this.is_sign_in = builder.is_sign_in;
    }
}
