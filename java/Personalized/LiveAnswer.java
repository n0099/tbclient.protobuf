package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class LiveAnswer extends Message {
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer banner_high;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer banner_width;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> click_statistics_urls;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> show_statistics_urls;
    public static final Integer DEFAULT_BANNER_WIDTH = 0;
    public static final Integer DEFAULT_BANNER_HIGH = 0;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final List<String> DEFAULT_SHOW_STATISTICS_URLS = Collections.emptyList();
    public static final List<String> DEFAULT_CLICK_STATISTICS_URLS = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveAnswer> {
        public Long activity_id;
        public Integer banner_high;
        public String banner_url;
        public Integer banner_width;
        public List<String> click_statistics_urls;
        public String jump_url;
        public List<String> show_statistics_urls;

        public Builder() {
        }

        public Builder(LiveAnswer liveAnswer) {
            super(liveAnswer);
            if (liveAnswer == null) {
                return;
            }
            this.banner_url = liveAnswer.banner_url;
            this.banner_width = liveAnswer.banner_width;
            this.banner_high = liveAnswer.banner_high;
            this.jump_url = liveAnswer.jump_url;
            this.activity_id = liveAnswer.activity_id;
            this.show_statistics_urls = Message.copyOf(liveAnswer.show_statistics_urls);
            this.click_statistics_urls = Message.copyOf(liveAnswer.click_statistics_urls);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveAnswer build(boolean z) {
            return new LiveAnswer(this, z);
        }
    }

    public LiveAnswer(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.banner_url;
            if (str == null) {
                this.banner_url = "";
            } else {
                this.banner_url = str;
            }
            Integer num = builder.banner_width;
            if (num == null) {
                this.banner_width = DEFAULT_BANNER_WIDTH;
            } else {
                this.banner_width = num;
            }
            Integer num2 = builder.banner_high;
            if (num2 == null) {
                this.banner_high = DEFAULT_BANNER_HIGH;
            } else {
                this.banner_high = num2;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            List<String> list = builder.show_statistics_urls;
            if (list == null) {
                this.show_statistics_urls = DEFAULT_SHOW_STATISTICS_URLS;
            } else {
                this.show_statistics_urls = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.click_statistics_urls;
            if (list2 == null) {
                this.click_statistics_urls = DEFAULT_CLICK_STATISTICS_URLS;
                return;
            } else {
                this.click_statistics_urls = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.banner_url = builder.banner_url;
        this.banner_width = builder.banner_width;
        this.banner_high = builder.banner_high;
        this.jump_url = builder.jump_url;
        this.activity_id = builder.activity_id;
        this.show_statistics_urls = Message.immutableCopyOf(builder.show_statistics_urls);
        this.click_statistics_urls = Message.immutableCopyOf(builder.click_statistics_urls);
    }
}
