package tbclient.DailyPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DailyInfo;
import tbclient.DailyTopic;
import tbclient.GodBanner;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<GodBanner> DEFAULT_BANNER = Collections.emptyList();
    public static final List<DailyTopic> DEFAULT_TOPIC = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GodBanner> banner;
    @ProtoField(tag = 3)
    public final DailyInfo daily_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<DailyTopic> topic;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<GodBanner> banner;
        public DailyInfo daily_info;
        public List<DailyTopic> topic;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.banner = Message.copyOf(dataRes.banner);
            this.topic = Message.copyOf(dataRes.topic);
            this.daily_info = dataRes.daily_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<GodBanner> list = builder.banner;
            if (list == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list);
            }
            List<DailyTopic> list2 = builder.topic;
            if (list2 == null) {
                this.topic = DEFAULT_TOPIC;
            } else {
                this.topic = Message.immutableCopyOf(list2);
            }
            this.daily_info = builder.daily_info;
            return;
        }
        this.banner = Message.immutableCopyOf(builder.banner);
        this.topic = Message.immutableCopyOf(builder.topic);
        this.daily_info = builder.daily_info;
    }
}
