package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumDataValue extends Message {
    public static final String DEFAULT_DATE = "";
    public static final Double DEFAULT_VALUE = Double.valueOf(0.0d);
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String date;
    @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
    public final Double value;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumDataValue> {
        public String date;
        public Double value;

        public Builder() {
        }

        public Builder(ForumDataValue forumDataValue) {
            super(forumDataValue);
            if (forumDataValue == null) {
                return;
            }
            this.date = forumDataValue.date;
            this.value = forumDataValue.value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDataValue build(boolean z) {
            return new ForumDataValue(this, z);
        }
    }

    public ForumDataValue(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.date;
            if (str == null) {
                this.date = "";
            } else {
                this.date = str;
            }
            Double d = builder.value;
            if (d == null) {
                this.value = DEFAULT_VALUE;
                return;
            } else {
                this.value = d;
                return;
            }
        }
        this.date = builder.date;
        this.value = builder.value;
    }
}
