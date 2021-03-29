package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class CreationData extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer agree_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer agree_count_trend;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer view_count;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer view_count_trend;
    public static final Integer DEFAULT_VIEW_COUNT = 0;
    public static final Integer DEFAULT_AGREE_COUNT = 0;
    public static final Integer DEFAULT_VIEW_COUNT_TREND = 0;
    public static final Integer DEFAULT_AGREE_COUNT_TREND = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CreationData> {
        public Integer agree_count;
        public Integer agree_count_trend;
        public Integer view_count;
        public Integer view_count_trend;

        public Builder() {
        }

        public Builder(CreationData creationData) {
            super(creationData);
            if (creationData == null) {
                return;
            }
            this.view_count = creationData.view_count;
            this.agree_count = creationData.agree_count;
            this.view_count_trend = creationData.view_count_trend;
            this.agree_count_trend = creationData.agree_count_trend;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CreationData build(boolean z) {
            return new CreationData(this, z);
        }
    }

    public CreationData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.view_count;
            if (num == null) {
                this.view_count = DEFAULT_VIEW_COUNT;
            } else {
                this.view_count = num;
            }
            Integer num2 = builder.agree_count;
            if (num2 == null) {
                this.agree_count = DEFAULT_AGREE_COUNT;
            } else {
                this.agree_count = num2;
            }
            Integer num3 = builder.view_count_trend;
            if (num3 == null) {
                this.view_count_trend = DEFAULT_VIEW_COUNT_TREND;
            } else {
                this.view_count_trend = num3;
            }
            Integer num4 = builder.agree_count_trend;
            if (num4 == null) {
                this.agree_count_trend = DEFAULT_AGREE_COUNT_TREND;
                return;
            } else {
                this.agree_count_trend = num4;
                return;
            }
        }
        this.view_count = builder.view_count;
        this.agree_count = builder.agree_count;
        this.view_count_trend = builder.view_count_trend;
        this.agree_count_trend = builder.agree_count_trend;
    }
}
