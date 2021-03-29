package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
/* loaded from: classes7.dex */
public final class NebulaHotThread extends Message {
    public static final String DEFAULT_GROUP_NAME = "";
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_THREAD_THUMBNAIL = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer comment_number;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PbContent> content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String group_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thread_thumbnail;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer thread_thumbnail_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_COMMENT_NUMBER = 0;
    public static final Integer DEFAULT_RANK = 0;
    public static final Integer DEFAULT_THREAD_THUMBNAIL_TYPE = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NebulaHotThread> {
        public Integer comment_number;
        public List<PbContent> content;
        public String group_name;
        public Integer rank;
        public String thread_id;
        public String thread_thumbnail;
        public Integer thread_thumbnail_type;
        public String url;

        public Builder() {
        }

        public Builder(NebulaHotThread nebulaHotThread) {
            super(nebulaHotThread);
            if (nebulaHotThread == null) {
                return;
            }
            this.thread_id = nebulaHotThread.thread_id;
            this.group_name = nebulaHotThread.group_name;
            this.comment_number = nebulaHotThread.comment_number;
            this.rank = nebulaHotThread.rank;
            this.url = nebulaHotThread.url;
            this.thread_thumbnail_type = nebulaHotThread.thread_thumbnail_type;
            this.thread_thumbnail = nebulaHotThread.thread_thumbnail;
            this.content = Message.copyOf(nebulaHotThread.content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NebulaHotThread build(boolean z) {
            return new NebulaHotThread(this, z);
        }
    }

    public NebulaHotThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.thread_id;
            if (str == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str;
            }
            String str2 = builder.group_name;
            if (str2 == null) {
                this.group_name = "";
            } else {
                this.group_name = str2;
            }
            Integer num = builder.comment_number;
            if (num == null) {
                this.comment_number = DEFAULT_COMMENT_NUMBER;
            } else {
                this.comment_number = num;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Integer num3 = builder.thread_thumbnail_type;
            if (num3 == null) {
                this.thread_thumbnail_type = DEFAULT_THREAD_THUMBNAIL_TYPE;
            } else {
                this.thread_thumbnail_type = num3;
            }
            String str4 = builder.thread_thumbnail;
            if (str4 == null) {
                this.thread_thumbnail = "";
            } else {
                this.thread_thumbnail = str4;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.group_name = builder.group_name;
        this.comment_number = builder.comment_number;
        this.rank = builder.rank;
        this.url = builder.url;
        this.thread_thumbnail_type = builder.thread_thumbnail_type;
        this.thread_thumbnail = builder.thread_thumbnail;
        this.content = Message.immutableCopyOf(builder.content);
    }
}
