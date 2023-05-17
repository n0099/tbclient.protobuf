package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class PostAntiInfo extends Message {
    public static final String DEFAULT_BLOCK_CANCEL = "";
    public static final String DEFAULT_BLOCK_CONFIRM = "";
    public static final String DEFAULT_BLOCK_CONTENT = "";
    public static final List<String> DEFAULT_CONFILTER_HITWORDS = Collections.emptyList();
    public static final String DEFAULT_NEED_VCODE = "";
    public static final String DEFAULT_PASS_TOKEN = "";
    public static final String DEFAULT_VCODE_MD5 = "";
    public static final String DEFAULT_VCODE_PIC_URL = "";
    public static final String DEFAULT_VCODE_PREV_TYPE = "";
    public static final String DEFAULT_VCODE_TYPE = "";
    @ProtoField(tag = 1)
    public final AccessState access_state;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String block_cancel;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String block_confirm;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String block_content;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> confilter_hitwords;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String need_vcode;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String pass_token;
    @ProtoField(tag = 13)
    public final VcodeExtra vcode_extra;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String vcode_md5;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String vcode_pic_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String vcode_prev_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String vcode_type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PostAntiInfo> {
        public AccessState access_state;
        public String block_cancel;
        public String block_confirm;
        public String block_content;
        public List<String> confilter_hitwords;
        public String need_vcode;
        public String pass_token;
        public VcodeExtra vcode_extra;
        public String vcode_md5;
        public String vcode_pic_url;
        public String vcode_prev_type;
        public String vcode_type;

        public Builder() {
        }

        public Builder(PostAntiInfo postAntiInfo) {
            super(postAntiInfo);
            if (postAntiInfo == null) {
                return;
            }
            this.access_state = postAntiInfo.access_state;
            this.confilter_hitwords = Message.copyOf(postAntiInfo.confilter_hitwords);
            this.need_vcode = postAntiInfo.need_vcode;
            this.vcode_md5 = postAntiInfo.vcode_md5;
            this.vcode_prev_type = postAntiInfo.vcode_prev_type;
            this.vcode_type = postAntiInfo.vcode_type;
            this.pass_token = postAntiInfo.pass_token;
            this.block_content = postAntiInfo.block_content;
            this.block_cancel = postAntiInfo.block_cancel;
            this.block_confirm = postAntiInfo.block_confirm;
            this.vcode_pic_url = postAntiInfo.vcode_pic_url;
            this.vcode_extra = postAntiInfo.vcode_extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostAntiInfo build(boolean z) {
            return new PostAntiInfo(this, z);
        }
    }

    public PostAntiInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.access_state = builder.access_state;
            List<String> list = builder.confilter_hitwords;
            if (list == null) {
                this.confilter_hitwords = DEFAULT_CONFILTER_HITWORDS;
            } else {
                this.confilter_hitwords = Message.immutableCopyOf(list);
            }
            String str = builder.need_vcode;
            if (str == null) {
                this.need_vcode = "";
            } else {
                this.need_vcode = str;
            }
            String str2 = builder.vcode_md5;
            if (str2 == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = str2;
            }
            String str3 = builder.vcode_prev_type;
            if (str3 == null) {
                this.vcode_prev_type = "";
            } else {
                this.vcode_prev_type = str3;
            }
            String str4 = builder.vcode_type;
            if (str4 == null) {
                this.vcode_type = "";
            } else {
                this.vcode_type = str4;
            }
            String str5 = builder.pass_token;
            if (str5 == null) {
                this.pass_token = "";
            } else {
                this.pass_token = str5;
            }
            String str6 = builder.block_content;
            if (str6 == null) {
                this.block_content = "";
            } else {
                this.block_content = str6;
            }
            String str7 = builder.block_cancel;
            if (str7 == null) {
                this.block_cancel = "";
            } else {
                this.block_cancel = str7;
            }
            String str8 = builder.block_confirm;
            if (str8 == null) {
                this.block_confirm = "";
            } else {
                this.block_confirm = str8;
            }
            String str9 = builder.vcode_pic_url;
            if (str9 == null) {
                this.vcode_pic_url = "";
            } else {
                this.vcode_pic_url = str9;
            }
            this.vcode_extra = builder.vcode_extra;
            return;
        }
        this.access_state = builder.access_state;
        this.confilter_hitwords = Message.immutableCopyOf(builder.confilter_hitwords);
        this.need_vcode = builder.need_vcode;
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_prev_type = builder.vcode_prev_type;
        this.vcode_type = builder.vcode_type;
        this.pass_token = builder.pass_token;
        this.block_content = builder.block_content;
        this.block_cancel = builder.block_cancel;
        this.block_confirm = builder.block_confirm;
        this.vcode_pic_url = builder.vcode_pic_url;
        this.vcode_extra = builder.vcode_extra;
    }
}
