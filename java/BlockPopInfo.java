package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BlockPopInfo extends Message {
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_APPEAL_MSG = "";
    public static final String DEFAULT_BLOCK_INFO = "";
    public static final String DEFAULT_IS_LIKE = "";
    public static final String DEFAULT_IS_NCLASS = "";
    public static final String DEFAULT_OK_INFO = "";
    public static final String DEFAULT_SUB_BLOCK_INFO = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ahead_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String appeal_msg;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer appeal_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String block_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_post;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String is_like;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String is_nclass;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String sub_block_info;
    public static final Integer DEFAULT_CAN_POST = 0;
    public static final Integer DEFAULT_AHEAD_TYPE = 0;
    public static final Integer DEFAULT_APPEAL_STATUS = 0;

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
            } else {
                this.ok_info = builder.ok_info;
            }
            if (builder.ahead_type == null) {
                this.ahead_type = DEFAULT_AHEAD_TYPE;
            } else {
                this.ahead_type = builder.ahead_type;
            }
            if (builder.appeal_status == null) {
                this.appeal_status = DEFAULT_APPEAL_STATUS;
            } else {
                this.appeal_status = builder.appeal_status;
            }
            if (builder.appeal_msg == null) {
                this.appeal_msg = "";
            } else {
                this.appeal_msg = builder.appeal_msg;
            }
            if (builder.is_like == null) {
                this.is_like = "";
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.is_nclass == null) {
                this.is_nclass = "";
            } else {
                this.is_nclass = builder.is_nclass;
            }
            if (builder.sub_block_info == null) {
                this.sub_block_info = "";
                return;
            } else {
                this.sub_block_info = builder.sub_block_info;
                return;
            }
        }
        this.can_post = builder.can_post;
        this.block_info = builder.block_info;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
        this.ahead_type = builder.ahead_type;
        this.appeal_status = builder.appeal_status;
        this.appeal_msg = builder.appeal_msg;
        this.is_like = builder.is_like;
        this.is_nclass = builder.is_nclass;
        this.sub_block_info = builder.sub_block_info;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BlockPopInfo> {
        public String ahead_info;
        public Integer ahead_type;
        public String ahead_url;
        public String appeal_msg;
        public Integer appeal_status;
        public String block_info;
        public Integer can_post;
        public String is_like;
        public String is_nclass;
        public String ok_info;
        public String sub_block_info;

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
                this.ahead_type = blockPopInfo.ahead_type;
                this.appeal_status = blockPopInfo.appeal_status;
                this.appeal_msg = blockPopInfo.appeal_msg;
                this.is_like = blockPopInfo.is_like;
                this.is_nclass = blockPopInfo.is_nclass;
                this.sub_block_info = blockPopInfo.sub_block_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BlockPopInfo build(boolean z) {
            return new BlockPopInfo(this, z);
        }
    }
}
