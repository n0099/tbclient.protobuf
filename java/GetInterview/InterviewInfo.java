package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
import tbclient.User;
/* loaded from: classes.dex */
public final class InterviewInfo extends Message {
    @ProtoField(tag = 5)
    public final User author;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PbContent> content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long create_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long main_pid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_MAIN_PID = 0L;

    /* synthetic */ InterviewInfo(Builder builder, boolean z, InterviewInfo interviewInfo) {
        this(builder, z);
    }

    private InterviewInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            this.author = builder.author;
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.main_pid == null) {
                this.main_pid = DEFAULT_MAIN_PID;
                return;
            } else {
                this.main_pid = builder.main_pid;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.content = immutableCopyOf(builder.content);
        this.create_time = builder.create_time;
        this.author = builder.author;
        this.type = builder.type;
        this.main_pid = builder.main_pid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<InterviewInfo> {
        public User author;
        public List<PbContent> content;
        public Long create_time;
        public Long main_pid;
        public Long post_id;
        public Integer type;

        public Builder() {
        }

        public Builder(InterviewInfo interviewInfo) {
            super(interviewInfo);
            if (interviewInfo != null) {
                this.post_id = interviewInfo.post_id;
                this.content = InterviewInfo.copyOf(interviewInfo.content);
                this.create_time = interviewInfo.create_time;
                this.author = interviewInfo.author;
                this.type = interviewInfo.type;
                this.main_pid = interviewInfo.main_pid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InterviewInfo build(boolean z) {
            return new InterviewInfo(this, z, null);
        }
    }
}
