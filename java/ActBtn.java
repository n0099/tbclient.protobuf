package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class ActBtn extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private ActBtn(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.text == null) {
                this.text = "";
                return;
            } else {
                this.text = builder.text;
                return;
            }
        }
        this.type = builder.type;
        this.url = builder.url;
        this.text = builder.text;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ActBtn> {
        public String text;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(ActBtn actBtn) {
            super(actBtn);
            if (actBtn != null) {
                this.type = actBtn.type;
                this.url = actBtn.url;
                this.text = actBtn.text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActBtn build(boolean z) {
            return new ActBtn(this, z);
        }
    }
}
