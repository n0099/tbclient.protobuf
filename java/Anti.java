package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Anti extends Message {
    public static final String DEFAULT_FORBID_INFO = "";
    public static final String DEFAULT_IFXIAOYING = "";
    public static final String DEFAULT_POLL_MESSAGE = "";
    public static final String DEFAULT_TBS = "";
    public static final String DEFAULT_USER_MUTE = "";
    public static final String DEFAULT_VCODE_MD5 = "";
    public static final String DEFAULT_VCODE_PIC_URL = "";
    public static final String DEFAULT_VIDEO_LOCAL_MESSAGE = "";
    public static final String DEFAULT_VIDEO_MESSAGE = "";
    public static final String DEFAULT_VOICE_MESSAGE = "";
    @ProtoField(tag = 22)
    public final BlockPopInfo block_pop_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer block_stat;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer days_tofree;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer forbid_flag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forbid_info;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer has_chance;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer hide_stat;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer ifaddition;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ifpost;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ifposta;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer ifvoice;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ifxiaoying;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer need_vcode;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String poll_message;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer reply_private_flag;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tbs;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String user_mute;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String vcode_md5;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String vcode_pic_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer vcode_stat;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String video_local_message;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String video_message;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String voice_message;
    public static final Integer DEFAULT_IFPOST = 0;
    public static final Integer DEFAULT_IFPOSTA = 0;
    public static final Integer DEFAULT_FORBID_FLAG = 0;
    public static final Integer DEFAULT_BLOCK_STAT = 0;
    public static final Integer DEFAULT_HIDE_STAT = 0;
    public static final Integer DEFAULT_VCODE_STAT = 0;
    public static final Integer DEFAULT_DAYS_TOFREE = 0;
    public static final Integer DEFAULT_HAS_CHANCE = 0;
    public static final Integer DEFAULT_IFVOICE = 0;
    public static final Integer DEFAULT_IFADDITION = 0;
    public static final Integer DEFAULT_NEED_VCODE = 0;
    public static final Integer DEFAULT_REPLY_PRIVATE_FLAG = 0;

    private Anti(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tbs == null) {
                this.tbs = "";
            } else {
                this.tbs = builder.tbs;
            }
            if (builder.ifpost == null) {
                this.ifpost = DEFAULT_IFPOST;
            } else {
                this.ifpost = builder.ifpost;
            }
            if (builder.ifposta == null) {
                this.ifposta = DEFAULT_IFPOSTA;
            } else {
                this.ifposta = builder.ifposta;
            }
            if (builder.forbid_flag == null) {
                this.forbid_flag = DEFAULT_FORBID_FLAG;
            } else {
                this.forbid_flag = builder.forbid_flag;
            }
            if (builder.forbid_info == null) {
                this.forbid_info = "";
            } else {
                this.forbid_info = builder.forbid_info;
            }
            if (builder.block_stat == null) {
                this.block_stat = DEFAULT_BLOCK_STAT;
            } else {
                this.block_stat = builder.block_stat;
            }
            if (builder.hide_stat == null) {
                this.hide_stat = DEFAULT_HIDE_STAT;
            } else {
                this.hide_stat = builder.hide_stat;
            }
            if (builder.vcode_stat == null) {
                this.vcode_stat = DEFAULT_VCODE_STAT;
            } else {
                this.vcode_stat = builder.vcode_stat;
            }
            if (builder.days_tofree == null) {
                this.days_tofree = DEFAULT_DAYS_TOFREE;
            } else {
                this.days_tofree = builder.days_tofree;
            }
            if (builder.has_chance == null) {
                this.has_chance = DEFAULT_HAS_CHANCE;
            } else {
                this.has_chance = builder.has_chance;
            }
            if (builder.ifvoice == null) {
                this.ifvoice = DEFAULT_IFVOICE;
            } else {
                this.ifvoice = builder.ifvoice;
            }
            if (builder.voice_message == null) {
                this.voice_message = "";
            } else {
                this.voice_message = builder.voice_message;
            }
            if (builder.ifaddition == null) {
                this.ifaddition = DEFAULT_IFADDITION;
            } else {
                this.ifaddition = builder.ifaddition;
            }
            if (builder.need_vcode == null) {
                this.need_vcode = DEFAULT_NEED_VCODE;
            } else {
                this.need_vcode = builder.need_vcode;
            }
            if (builder.vcode_md5 == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = builder.vcode_md5;
            }
            if (builder.vcode_pic_url == null) {
                this.vcode_pic_url = "";
            } else {
                this.vcode_pic_url = builder.vcode_pic_url;
            }
            if (builder.user_mute == null) {
                this.user_mute = "";
            } else {
                this.user_mute = builder.user_mute;
            }
            if (builder.ifxiaoying == null) {
                this.ifxiaoying = "";
            } else {
                this.ifxiaoying = builder.ifxiaoying;
            }
            if (builder.poll_message == null) {
                this.poll_message = "";
            } else {
                this.poll_message = builder.poll_message;
            }
            if (builder.video_message == null) {
                this.video_message = "";
            } else {
                this.video_message = builder.video_message;
            }
            if (builder.video_local_message == null) {
                this.video_local_message = "";
            } else {
                this.video_local_message = builder.video_local_message;
            }
            this.block_pop_info = builder.block_pop_info;
            if (builder.reply_private_flag == null) {
                this.reply_private_flag = DEFAULT_REPLY_PRIVATE_FLAG;
                return;
            } else {
                this.reply_private_flag = builder.reply_private_flag;
                return;
            }
        }
        this.tbs = builder.tbs;
        this.ifpost = builder.ifpost;
        this.ifposta = builder.ifposta;
        this.forbid_flag = builder.forbid_flag;
        this.forbid_info = builder.forbid_info;
        this.block_stat = builder.block_stat;
        this.hide_stat = builder.hide_stat;
        this.vcode_stat = builder.vcode_stat;
        this.days_tofree = builder.days_tofree;
        this.has_chance = builder.has_chance;
        this.ifvoice = builder.ifvoice;
        this.voice_message = builder.voice_message;
        this.ifaddition = builder.ifaddition;
        this.need_vcode = builder.need_vcode;
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_pic_url = builder.vcode_pic_url;
        this.user_mute = builder.user_mute;
        this.ifxiaoying = builder.ifxiaoying;
        this.poll_message = builder.poll_message;
        this.video_message = builder.video_message;
        this.video_local_message = builder.video_local_message;
        this.block_pop_info = builder.block_pop_info;
        this.reply_private_flag = builder.reply_private_flag;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Anti> {
        public BlockPopInfo block_pop_info;
        public Integer block_stat;
        public Integer days_tofree;
        public Integer forbid_flag;
        public String forbid_info;
        public Integer has_chance;
        public Integer hide_stat;
        public Integer ifaddition;
        public Integer ifpost;
        public Integer ifposta;
        public Integer ifvoice;
        public String ifxiaoying;
        public Integer need_vcode;
        public String poll_message;
        public Integer reply_private_flag;
        public String tbs;
        public String user_mute;
        public String vcode_md5;
        public String vcode_pic_url;
        public Integer vcode_stat;
        public String video_local_message;
        public String video_message;
        public String voice_message;

        public Builder() {
        }

        public Builder(Anti anti) {
            super(anti);
            if (anti != null) {
                this.tbs = anti.tbs;
                this.ifpost = anti.ifpost;
                this.ifposta = anti.ifposta;
                this.forbid_flag = anti.forbid_flag;
                this.forbid_info = anti.forbid_info;
                this.block_stat = anti.block_stat;
                this.hide_stat = anti.hide_stat;
                this.vcode_stat = anti.vcode_stat;
                this.days_tofree = anti.days_tofree;
                this.has_chance = anti.has_chance;
                this.ifvoice = anti.ifvoice;
                this.voice_message = anti.voice_message;
                this.ifaddition = anti.ifaddition;
                this.need_vcode = anti.need_vcode;
                this.vcode_md5 = anti.vcode_md5;
                this.vcode_pic_url = anti.vcode_pic_url;
                this.user_mute = anti.user_mute;
                this.ifxiaoying = anti.ifxiaoying;
                this.poll_message = anti.poll_message;
                this.video_message = anti.video_message;
                this.video_local_message = anti.video_local_message;
                this.block_pop_info = anti.block_pop_info;
                this.reply_private_flag = anti.reply_private_flag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Anti build(boolean z) {
            return new Anti(this, z);
        }
    }
}
