package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class SignatureContent extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SignatureContent> {
        public String text;
        public Integer type;

        public Builder() {
        }

        public Builder(SignatureContent signatureContent) {
            super(signatureContent);
            if (signatureContent == null) {
                return;
            }
            this.type = signatureContent.type;
            this.text = signatureContent.text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignatureContent build(boolean z) {
            return new SignatureContent(this, z);
        }
    }

    public SignatureContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
                return;
            } else {
                this.text = str;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
    }
}
