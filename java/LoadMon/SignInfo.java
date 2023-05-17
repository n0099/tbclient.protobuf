package tbclient.LoadMon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class SignInfo extends Message {
    public static final String DEFAULT_DATE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String date;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<SignInfo> {
        public String date;

        public Builder() {
        }

        public Builder(SignInfo signInfo) {
            super(signInfo);
            if (signInfo == null) {
                return;
            }
            this.date = signInfo.date;
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
            String str = builder.date;
            if (str == null) {
                this.date = "";
                return;
            } else {
                this.date = str;
                return;
            }
        }
        this.date = builder.date;
    }
}
