package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class Voice_Info extends Message {
    public static final String DEFAULT_MD5 = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer durning_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_DURNING_TIME = 0;
    public static final Integer DEFAULT_TYPE = 0;

    private Voice_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = builder.pid;
            }
            if (builder.durning_time == null) {
                this.durning_time = DEFAULT_DURNING_TIME;
            } else {
                this.durning_time = builder.durning_time;
            }
            if (builder.md5 == null) {
                this.md5 = "";
            } else {
                this.md5 = builder.md5;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.tid = builder.tid;
        this.pid = builder.pid;
        this.durning_time = builder.durning_time;
        this.md5 = builder.md5;
        this.type = builder.type;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<Voice_Info> {
        public Integer durning_time;
        public String md5;
        public Long pid;
        public Long tid;
        public Integer type;

        public Builder() {
        }

        public Builder(Voice_Info voice_Info) {
            super(voice_Info);
            if (voice_Info != null) {
                this.tid = voice_Info.tid;
                this.pid = voice_Info.pid;
                this.durning_time = voice_Info.durning_time;
                this.md5 = voice_Info.md5;
                this.type = voice_Info.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Voice_Info build(boolean z) {
            return new Voice_Info(this, z);
        }
    }
}
