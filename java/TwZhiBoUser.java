package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TwZhiBoUser extends Message {
    public static final Integer DEFAULT_ANCHOR_LEVEL = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer anchor_level;

    /* synthetic */ TwZhiBoUser(Builder builder, boolean z, TwZhiBoUser twZhiBoUser) {
        this(builder, z);
    }

    private TwZhiBoUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.anchor_level == null) {
                this.anchor_level = DEFAULT_ANCHOR_LEVEL;
                return;
            } else {
                this.anchor_level = builder.anchor_level;
                return;
            }
        }
        this.anchor_level = builder.anchor_level;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TwZhiBoUser> {
        public Integer anchor_level;

        public Builder() {
        }

        public Builder(TwZhiBoUser twZhiBoUser) {
            super(twZhiBoUser);
            if (twZhiBoUser != null) {
                this.anchor_level = twZhiBoUser.anchor_level;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoUser build(boolean z) {
            return new TwZhiBoUser(this, z, null);
        }
    }
}
