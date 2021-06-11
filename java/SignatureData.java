package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class SignatureData extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SignatureContent> content;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer signature_id;
    public static final Integer DEFAULT_SIGNATURE_ID = 0;
    public static final List<SignatureContent> DEFAULT_CONTENT = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SignatureData> {
        public List<SignatureContent> content;
        public String fontColor;
        public String fontKeyName;
        public Integer signature_id;

        public Builder() {
        }

        public Builder(SignatureData signatureData) {
            super(signatureData);
            if (signatureData == null) {
                return;
            }
            this.signature_id = signatureData.signature_id;
            this.fontKeyName = signatureData.fontKeyName;
            this.fontColor = signatureData.fontColor;
            this.content = Message.copyOf(signatureData.content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignatureData build(boolean z) {
            return new SignatureData(this, z);
        }
    }

    public SignatureData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.signature_id;
            if (num == null) {
                this.signature_id = DEFAULT_SIGNATURE_ID;
            } else {
                this.signature_id = num;
            }
            String str = builder.fontKeyName;
            if (str == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = str;
            }
            String str2 = builder.fontColor;
            if (str2 == null) {
                this.fontColor = "";
            } else {
                this.fontColor = str2;
            }
            List<SignatureContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.signature_id = builder.signature_id;
        this.fontKeyName = builder.fontKeyName;
        this.fontColor = builder.fontColor;
        this.content = Message.immutableCopyOf(builder.content);
    }
}
