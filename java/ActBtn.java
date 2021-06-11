package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ActBtn> {
        public String text;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(ActBtn actBtn) {
            super(actBtn);
            if (actBtn == null) {
                return;
            }
            this.type = actBtn.type;
            this.url = actBtn.url;
            this.text = actBtn.text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActBtn build(boolean z) {
            return new ActBtn(this, z);
        }
    }

    public ActBtn(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
                return;
            } else {
                this.text = str2;
                return;
            }
        }
        this.type = builder.type;
        this.url = builder.url;
        this.text = builder.text;
    }
}
