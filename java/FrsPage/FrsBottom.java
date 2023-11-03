package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsBottomActivityBase;
import tbclient.FrsBottomChatroomBase;
import tbclient.FrsBottomSmartBgColor;
/* loaded from: classes2.dex */
public final class FrsBottom extends Message {
    public static final Integer DEFAULT_HAS_MORE_MODULE = 0;
    @ProtoField(tag = 1)
    public final FrsBottomActivityBase frs_activity;
    @ProtoField(tag = 2)
    public final FrsBottomChatroomBase frs_chatroom;
    @ProtoField(tag = 3)
    public final FrsBottomSmartBgColor frs_smart_bg_color;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more_module;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsBottom> {
        public FrsBottomActivityBase frs_activity;
        public FrsBottomChatroomBase frs_chatroom;
        public FrsBottomSmartBgColor frs_smart_bg_color;
        public Integer has_more_module;

        public Builder() {
        }

        public Builder(FrsBottom frsBottom) {
            super(frsBottom);
            if (frsBottom == null) {
                return;
            }
            this.frs_activity = frsBottom.frs_activity;
            this.frs_chatroom = frsBottom.frs_chatroom;
            this.frs_smart_bg_color = frsBottom.frs_smart_bg_color;
            this.has_more_module = frsBottom.has_more_module;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBottom build(boolean z) {
            return new FrsBottom(this, z);
        }
    }

    public FrsBottom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.frs_activity = builder.frs_activity;
            this.frs_chatroom = builder.frs_chatroom;
            this.frs_smart_bg_color = builder.frs_smart_bg_color;
            Integer num = builder.has_more_module;
            if (num == null) {
                this.has_more_module = DEFAULT_HAS_MORE_MODULE;
                return;
            } else {
                this.has_more_module = num;
                return;
            }
        }
        this.frs_activity = builder.frs_activity;
        this.frs_chatroom = builder.frs_chatroom;
        this.frs_smart_bg_color = builder.frs_smart_bg_color;
        this.has_more_module = builder.has_more_module;
    }
}
