package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
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

    private HighReply(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.uname == null) {
                this.uname = "";
            } else {
                this.uname = builder.uname;
            }
            if (builder.hid == null) {
                this.hid = DEFAULT_HID;
            } else {
                this.hid = builder.hid;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = builder.id;
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

    /* loaded from: classes16.dex */
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
            if (highReply != null) {
                this.uid = highReply.uid;
                this.uname = highReply.uname;
                this.hid = highReply.hid;
                this.content = highReply.content;
                this.create_time = highReply.create_time;
                this.portrait = highReply.portrait;
                this.id = highReply.id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HighReply build(boolean z) {
            return new HighReply(this, z);
        }
    }
}
