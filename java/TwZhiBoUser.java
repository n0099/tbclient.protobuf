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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TwZhiBoUser> {
        public Integer anchor_level;
        public String field_ex;
        public Integer in_black_list;

        public Builder() {
        }

        public Builder(TwZhiBoUser twZhiBoUser) {
            super(twZhiBoUser);
            if (twZhiBoUser == null) {
                return;
            }
            this.anchor_level = twZhiBoUser.anchor_level;
            this.in_black_list = twZhiBoUser.in_black_list;
            this.field_ex = twZhiBoUser.field_ex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoUser build(boolean z) {
            return new TwZhiBoUser(this, z);
        }
    }

    public TwZhiBoUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.anchor_level;
            if (num == null) {
                this.anchor_level = DEFAULT_ANCHOR_LEVEL;
            } else {
                this.anchor_level = num;
            }
            Integer num2 = builder.in_black_list;
            if (num2 == null) {
                this.in_black_list = DEFAULT_IN_BLACK_LIST;
            } else {
                this.in_black_list = num2;
            }
            String str = builder.field_ex;
            if (str == null) {
                this.field_ex = "";
                return;
            } else {
                this.field_ex = str;
                return;
            }
        }
        this.anchor_level = builder.anchor_level;
        this.in_black_list = builder.in_black_list;
        this.field_ex = builder.field_ex;
    }
}
