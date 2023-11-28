package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class VideoDoubleRowLayout extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> business_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FeedKV> log_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoDoubleRowLayout> {
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public List<FeedKV> log_info;
        public String schema;

        public Builder() {
        }

        public Builder(VideoDoubleRowLayout videoDoubleRowLayout) {
            super(videoDoubleRowLayout);
            if (videoDoubleRowLayout == null) {
                return;
            }
            this.components = Message.copyOf(videoDoubleRowLayout.components);
            this.schema = videoDoubleRowLayout.schema;
            this.business_info = Message.copyOf(videoDoubleRowLayout.business_info);
            this.log_info = Message.copyOf(videoDoubleRowLayout.log_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoDoubleRowLayout build(boolean z) {
            return new VideoDoubleRowLayout(this, z);
        }
    }

    public VideoDoubleRowLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
            }
            List<FeedKV> list3 = builder.log_info;
            if (list3 == null) {
                this.log_info = DEFAULT_LOG_INFO;
                return;
            } else {
                this.log_info = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.schema = builder.schema;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.log_info = Message.immutableCopyOf(builder.log_info);
    }
}
