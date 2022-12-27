package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
    @ProtoField(tag = 2)
    public final PkModule pk_module;
    @ProtoField(tag = 9)
    public final RelateThread relate_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<SpecialTopic> special_topic;
    @ProtoField(tag = 4)
    public final TimeLine time_line;
    @ProtoField(tag = 1)
    public final TopicDetail topic_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public PkModule pk_module;
        public RelateThread relate_thread;
        public List<SpecialTopic> special_topic;
        public TimeLine time_line;
        public TopicDetail topic_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.topic_info = dataRes.topic_info;
            this.pk_module = dataRes.pk_module;
            this.time_line = dataRes.time_line;
            this.special_topic = Message.copyOf(dataRes.special_topic);
            this.relate_thread = dataRes.relate_thread;
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
            this.topic_info = builder.topic_info;
            this.pk_module = builder.pk_module;
            this.time_line = builder.time_line;
            List<SpecialTopic> list = builder.special_topic;
            if (list == null) {
                this.special_topic = DEFAULT_SPECIAL_TOPIC;
            } else {
                this.special_topic = Message.immutableCopyOf(list);
            }
            this.relate_thread = builder.relate_thread;
            return;
        }
        this.topic_info = builder.topic_info;
        this.pk_module = builder.pk_module;
        this.time_line = builder.time_line;
        this.special_topic = Message.immutableCopyOf(builder.special_topic);
        this.relate_thread = builder.relate_thread;
    }
}
