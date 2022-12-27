package tbclient.Notice;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Notice extends Message {
    public static final String DEFAULT_AT_UID = "";
    public static final String DEFAULT_AT_UNAME = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String at_uid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String at_uname;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long hid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_ALBUM_ID = 0L;
    public static final Long DEFAULT_HID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Long DEFAULT_USER_ID = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Notice> {
        public Long album_id;
        public String at_uid;
        public String at_uname;
        public String content;
        public Integer create_time;
        public Long hid;
        public String pic_url;
        public String portrait;
        public Integer type;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(Notice notice) {
            super(notice);
            if (notice == null) {
                return;
            }
            this.type = notice.type;
            this.user_name = notice.user_name;
            this.portrait = notice.portrait;
            this.album_id = notice.album_id;
            this.hid = notice.hid;
            this.content = notice.content;
            this.create_time = notice.create_time;
            this.pic_url = notice.pic_url;
            this.user_id = notice.user_id;
            this.at_uname = notice.at_uname;
            this.at_uid = notice.at_uid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Notice build(boolean z) {
            return new Notice(this, z);
        }
    }

    public Notice(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Long l = builder.album_id;
            if (l == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = l;
            }
            Long l2 = builder.hid;
            if (l2 == null) {
                this.hid = DEFAULT_HID;
            } else {
                this.hid = l2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num2 = builder.create_time;
            if (num2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num2;
            }
            String str4 = builder.pic_url;
            if (str4 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str4;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            String str5 = builder.at_uname;
            if (str5 == null) {
                this.at_uname = "";
            } else {
                this.at_uname = str5;
            }
            String str6 = builder.at_uid;
            if (str6 == null) {
                this.at_uid = "";
                return;
            } else {
                this.at_uid = str6;
                return;
            }
        }
        this.type = builder.type;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.album_id = builder.album_id;
        this.hid = builder.hid;
        this.content = builder.content;
        this.create_time = builder.create_time;
        this.pic_url = builder.pic_url;
        this.user_id = builder.user_id;
        this.at_uname = builder.at_uname;
        this.at_uid = builder.at_uid;
    }
}
