package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
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

    private SignatureData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.signature_id == null) {
                this.signature_id = DEFAULT_SIGNATURE_ID;
            } else {
                this.signature_id = builder.signature_id;
            }
            if (builder.fontKeyName == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = builder.fontKeyName;
            }
            if (builder.fontColor == null) {
                this.fontColor = "";
            } else {
                this.fontColor = builder.fontColor;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = immutableCopyOf(builder.content);
                return;
            }
        }
        this.signature_id = builder.signature_id;
        this.fontKeyName = builder.fontKeyName;
        this.fontColor = builder.fontColor;
        this.content = immutableCopyOf(builder.content);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<SignatureData> {
        public List<SignatureContent> content;
        public String fontColor;
        public String fontKeyName;
        public Integer signature_id;

        public Builder() {
        }

        public Builder(SignatureData signatureData) {
            super(signatureData);
            if (signatureData != null) {
                this.signature_id = signatureData.signature_id;
                this.fontKeyName = signatureData.fontKeyName;
                this.fontColor = signatureData.fontColor;
                this.content = SignatureData.copyOf(signatureData.content);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignatureData build(boolean z) {
            return new SignatureData(this, z);
        }
    }
}
