package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TwZhiBoAnti extends Message {
    public static final Integer DEFAULT_CAN_ADD_LIVE_POST = 0;
    public static final Integer DEFAULT_CAN_DEL_LIVE_POST = 0;
    public static final Integer DEFAULT_CAN_SHOW_PB_HEADLINE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_add_live_post;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer can_del_live_post;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_show_pb_headline;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TwZhiBoAnti> {
        public Integer can_add_live_post;
        public Integer can_del_live_post;
        public Integer can_show_pb_headline;

        public Builder() {
        }

        public Builder(TwZhiBoAnti twZhiBoAnti) {
            super(twZhiBoAnti);
            if (twZhiBoAnti == null) {
                return;
            }
            this.can_add_live_post = twZhiBoAnti.can_add_live_post;
            this.can_del_live_post = twZhiBoAnti.can_del_live_post;
            this.can_show_pb_headline = twZhiBoAnti.can_show_pb_headline;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoAnti build(boolean z) {
            return new TwZhiBoAnti(this, z);
        }
    }

    public TwZhiBoAnti(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.can_add_live_post;
            if (num == null) {
                this.can_add_live_post = DEFAULT_CAN_ADD_LIVE_POST;
            } else {
                this.can_add_live_post = num;
            }
            Integer num2 = builder.can_del_live_post;
            if (num2 == null) {
                this.can_del_live_post = DEFAULT_CAN_DEL_LIVE_POST;
            } else {
                this.can_del_live_post = num2;
            }
            Integer num3 = builder.can_show_pb_headline;
            if (num3 == null) {
                this.can_show_pb_headline = DEFAULT_CAN_SHOW_PB_HEADLINE;
                return;
            } else {
                this.can_show_pb_headline = num3;
                return;
            }
        }
        this.can_add_live_post = builder.can_add_live_post;
        this.can_del_live_post = builder.can_del_live_post;
        this.can_show_pb_headline = builder.can_show_pb_headline;
    }
}
