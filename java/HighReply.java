package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class HighReply extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_UNAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long hid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String uname;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_HID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Long DEFAULT_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HighReply> {
        public String content;
        public Integer create_time;
        public Long hid;
        public Long id;
        public String portrait;
        public Long uid;
        public String uname;

        public Builder() {
        }

        public Builder(HighReply highReply) {
            super(highReply);
            if (highReply == null) {
                return;
            }
            this.uid = highReply.uid;
            this.uname = highReply.uname;
            this.hid = highReply.hid;
            this.content = highReply.content;
            this.create_time = highReply.create_time;
            this.portrait = highReply.portrait;
            this.id = highReply.id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HighReply build(boolean z) {
            return new HighReply(this, z);
        }
    }

    public HighReply(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.uname;
            if (str == null) {
                this.uname = "";
            } else {
                this.uname = str;
            }
            Long l2 = builder.hid;
            if (l2 == null) {
                this.hid = DEFAULT_HID;
            } else {
                this.hid = l2;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Long l3 = builder.id;
            if (l3 == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = l3;
                return;
            }
        }
        this.uid = builder.uid;
        this.uname = builder.uname;
        this.hid = builder.hid;
        this.content = builder.content;
        this.create_time = builder.create_time;
        this.portrait = builder.portrait;
        this.id = builder.id;
    }
}
