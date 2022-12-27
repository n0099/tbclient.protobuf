package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Avatar extends Message {
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_POS = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pos;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Avatar> {
        public String pic;
        public String pos;

        public Builder() {
        }

        public Builder(Avatar avatar) {
            super(avatar);
            if (avatar == null) {
                return;
            }
            this.pic = avatar.pic;
            this.pos = avatar.pos;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Avatar build(boolean z) {
            return new Avatar(this, z);
        }
    }

    public Avatar(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            String str2 = builder.pos;
            if (str2 == null) {
                this.pos = "";
                return;
            } else {
                this.pos = str2;
                return;
            }
        }
        this.pic = builder.pic;
        this.pos = builder.pos;
    }
}
