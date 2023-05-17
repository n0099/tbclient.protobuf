package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class VideoActive extends Message {
    public static final String DEFAULT_ACTIVE_NAME = "";
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_NATIVE_URL = "";
    public static final String DEFAULT_REMARK = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String active_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String native_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String remark;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadInfo> thread_list;
    public static final Integer DEFAULT_ID = 0;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoActive> {
        public String active_name;
        public String active_url;
        public String banner_url;
        public String description;
        public Integer id;
        public String native_url;
        public String remark;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(VideoActive videoActive) {
            super(videoActive);
            if (videoActive == null) {
                return;
            }
            this.id = videoActive.id;
            this.active_name = videoActive.active_name;
            this.active_url = videoActive.active_url;
            this.native_url = videoActive.native_url;
            this.description = videoActive.description;
            this.banner_url = videoActive.banner_url;
            this.remark = videoActive.remark;
            this.thread_list = Message.copyOf(videoActive.thread_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoActive build(boolean z) {
            return new VideoActive(this, z);
        }
    }

    public VideoActive(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.active_name;
            if (str == null) {
                this.active_name = "";
            } else {
                this.active_name = str;
            }
            String str2 = builder.active_url;
            if (str2 == null) {
                this.active_url = "";
            } else {
                this.active_url = str2;
            }
            String str3 = builder.native_url;
            if (str3 == null) {
                this.native_url = "";
            } else {
                this.native_url = str3;
            }
            String str4 = builder.description;
            if (str4 == null) {
                this.description = "";
            } else {
                this.description = str4;
            }
            String str5 = builder.banner_url;
            if (str5 == null) {
                this.banner_url = "";
            } else {
                this.banner_url = str5;
            }
            String str6 = builder.remark;
            if (str6 == null) {
                this.remark = "";
            } else {
                this.remark = str6;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.active_name = builder.active_name;
        this.active_url = builder.active_url;
        this.native_url = builder.native_url;
        this.description = builder.description;
        this.banner_url = builder.banner_url;
        this.remark = builder.remark;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
    }
}
