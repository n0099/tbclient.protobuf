package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class InsertFloor extends Message {
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<VideoCard> wander_list;
    public static final Integer DEFAULT_TOPIC_ID = 0;
    public static final List<VideoCard> DEFAULT_WANDER_LIST = Collections.emptyList();

    private InsertFloor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.topic_name == null) {
                this.topic_name = "";
            } else {
                this.topic_name = builder.topic_name;
            }
            if (builder.wander_list == null) {
                this.wander_list = DEFAULT_WANDER_LIST;
                return;
            } else {
                this.wander_list = immutableCopyOf(builder.wander_list);
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.wander_list = immutableCopyOf(builder.wander_list);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<InsertFloor> {
        public Integer topic_id;
        public String topic_name;
        public List<VideoCard> wander_list;

        public Builder() {
        }

        public Builder(InsertFloor insertFloor) {
            super(insertFloor);
            if (insertFloor != null) {
                this.topic_id = insertFloor.topic_id;
                this.topic_name = insertFloor.topic_name;
                this.wander_list = InsertFloor.copyOf(insertFloor.wander_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InsertFloor build(boolean z) {
            return new InsertFloor(this, z);
        }
    }
}
