package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TwZhiBoUser extends Message {
    public static final String DEFAULT_FIELD_EX = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer anchor_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String field_ex;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer in_black_list;
    public static final Integer DEFAULT_ANCHOR_LEVEL = 0;
    public static final Integer DEFAULT_IN_BLACK_LIST = 0;

    private TwZhiBoUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.anchor_level == null) {
                this.anchor_level = DEFAULT_ANCHOR_LEVEL;
            } else {
                this.anchor_level = builder.anchor_level;
            }
            if (builder.in_black_list == null) {
                this.in_black_list = DEFAULT_IN_BLACK_LIST;
            } else {
                this.in_black_list = builder.in_black_list;
            }
            if (builder.field_ex == null) {
                this.field_ex = "";
                return;
            } else {
                this.field_ex = builder.field_ex;
                return;
            }
        }
        this.anchor_level = builder.anchor_level;
        this.in_black_list = builder.in_black_list;
        this.field_ex = builder.field_ex;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TwZhiBoUser> {
        public Integer anchor_level;
        public String field_ex;
        public Integer in_black_list;

        public Builder() {
        }

        public Builder(TwZhiBoUser twZhiBoUser) {
            super(twZhiBoUser);
            if (twZhiBoUser != null) {
                this.anchor_level = twZhiBoUser.anchor_level;
                this.in_black_list = twZhiBoUser.in_black_list;
                this.field_ex = twZhiBoUser.field_ex;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoUser build(boolean z) {
            return new TwZhiBoUser(this, z);
        }
    }
}
