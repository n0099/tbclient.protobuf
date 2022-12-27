package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class StarContri extends Message {
    public static final String DEFAULT_AFTER_MSG = "";
    public static final String DEFAULT_COLOR_MSG = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String after_msg;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String color_msg;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StarContri> {
        public String after_msg;
        public String color_msg;

        public Builder() {
        }

        public Builder(StarContri starContri) {
            super(starContri);
            if (starContri == null) {
                return;
            }
            this.color_msg = starContri.color_msg;
            this.after_msg = starContri.after_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarContri build(boolean z) {
            return new StarContri(this, z);
        }
    }

    public StarContri(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.color_msg;
            if (str == null) {
                this.color_msg = "";
            } else {
                this.color_msg = str;
            }
            String str2 = builder.after_msg;
            if (str2 == null) {
                this.after_msg = "";
                return;
            } else {
                this.after_msg = str2;
                return;
            }
        }
        this.color_msg = builder.color_msg;
        this.after_msg = builder.after_msg;
    }
}
