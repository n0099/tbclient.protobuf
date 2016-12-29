package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BlockPopInfo extends Message {
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_BLOCK_INFO = "";
    public static final Integer DEFAULT_CAN_POST = 0;
    public static final String DEFAULT_OK_INFO = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String block_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_post;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ok_info;

    /* synthetic */ BlockPopInfo(Builder builder, boolean z, BlockPopInfo blockPopInfo) {
        this(builder, z);
    }

    private BlockPopInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.can_post == null) {
                this.can_post = DEFAULT_CAN_POST;
            } else {
                this.can_post = builder.can_post;
            }
            if (builder.block_info == null) {
                this.block_info = "";
            } else {
                this.block_info = builder.block_info;
            }
            if (builder.ahead_info == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = builder.ahead_info;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.ok_info == null) {
                this.ok_info = "";
                return;
            } else {
                this.ok_info = builder.ok_info;
                return;
            }
        }
        this.can_post = builder.can_post;
        this.block_info = builder.block_info;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BlockPopInfo> {
        public String ahead_info;
        public String ahead_url;
        public String block_info;
        public Integer can_post;
        public String ok_info;

        public Builder() {
        }

        public Builder(BlockPopInfo blockPopInfo) {
            super(blockPopInfo);
            if (blockPopInfo != null) {
                this.can_post = blockPopInfo.can_post;
                this.block_info = blockPopInfo.block_info;
                this.ahead_info = blockPopInfo.ahead_info;
                this.ahead_url = blockPopInfo.ahead_url;
                this.ok_info = blockPopInfo.ok_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BlockPopInfo build(boolean z) {
            return new BlockPopInfo(this, z, null);
        }
    }
}
