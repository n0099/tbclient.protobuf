package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Avatar extends Message {
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_POS = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pos;

    /* synthetic */ Avatar(Builder builder, boolean z, Avatar avatar) {
        this(builder, z);
    }

    private Avatar(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.pos == null) {
                this.pos = "";
                return;
            } else {
                this.pos = builder.pos;
                return;
            }
        }
        this.pic = builder.pic;
        this.pos = builder.pos;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Avatar> {
        public String pic;
        public String pos;

        public Builder(Avatar avatar) {
            super(avatar);
            if (avatar != null) {
                this.pic = avatar.pic;
                this.pos = avatar.pos;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Avatar build(boolean z) {
            return new Avatar(this, z, null);
        }
    }
}
