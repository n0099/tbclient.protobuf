package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecGuide extends Message {
    public static final String DEFAULT_DOCUMENT = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String document;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecGuide> {
        public String document;
        public String pic;
        public String url;

        public Builder() {
        }

        public Builder(RecGuide recGuide) {
            super(recGuide);
            if (recGuide == null) {
                return;
            }
            this.document = recGuide.document;
            this.url = recGuide.url;
            this.pic = recGuide.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecGuide build(boolean z) {
            return new RecGuide(this, z);
        }
    }

    public RecGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.document;
            if (str == null) {
                this.document = "";
            } else {
                this.document = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.pic;
            if (str3 == null) {
                this.pic = "";
                return;
            } else {
                this.pic = str3;
                return;
            }
        }
        this.document = builder.document;
        this.url = builder.url;
        this.pic = builder.pic;
    }
}
