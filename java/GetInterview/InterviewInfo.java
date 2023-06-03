package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
import tbclient.User;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (interviewInfo == null) {
                return;
            }
            this.post_id = interviewInfo.post_id;
            this.content = Message.copyOf(interviewInfo.content);
            this.create_time = interviewInfo.create_time;
            this.author = interviewInfo.author;
            this.type = interviewInfo.type;
            this.main_pid = interviewInfo.main_pid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InterviewInfo build(boolean z) {
            return new InterviewInfo(this, z);
        }
    }

    public InterviewInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Long l2 = builder.create_time;
            if (l2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l2;
            }
            this.author = builder.author;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l3 = builder.main_pid;
            if (l3 == null) {
                this.main_pid = DEFAULT_MAIN_PID;
                return;
            } else {
                this.main_pid = l3;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.content = Message.immutableCopyOf(builder.content);
        this.create_time = builder.create_time;
        this.author = builder.author;
        this.type = builder.type;
        this.main_pid = builder.main_pid;
    }
}
