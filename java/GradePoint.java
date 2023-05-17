package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class GradePoint extends Message {
    public static final String DEFAULT_POINT_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer current_point;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer next_point;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String point_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer point_type;
    public static final Integer DEFAULT_POINT_TYPE = 0;
    public static final Integer DEFAULT_CURRENT_POINT = 0;
    public static final Integer DEFAULT_NEXT_POINT = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GradePoint> {
        public Integer current_point;
        public Integer next_point;
        public String point_name;
        public Integer point_type;

        public Builder() {
        }

        public Builder(GradePoint gradePoint) {
            super(gradePoint);
            if (gradePoint == null) {
                return;
            }
            this.point_name = gradePoint.point_name;
            this.point_type = gradePoint.point_type;
            this.current_point = gradePoint.current_point;
            this.next_point = gradePoint.next_point;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GradePoint build(boolean z) {
            return new GradePoint(this, z);
        }
    }

    public GradePoint(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.point_name;
            if (str == null) {
                this.point_name = "";
            } else {
                this.point_name = str;
            }
            Integer num = builder.point_type;
            if (num == null) {
                this.point_type = DEFAULT_POINT_TYPE;
            } else {
                this.point_type = num;
            }
            Integer num2 = builder.current_point;
            if (num2 == null) {
                this.current_point = DEFAULT_CURRENT_POINT;
            } else {
                this.current_point = num2;
            }
            Integer num3 = builder.next_point;
            if (num3 == null) {
                this.next_point = DEFAULT_NEXT_POINT;
                return;
            } else {
                this.next_point = num3;
                return;
            }
        }
        this.point_name = builder.point_name;
        this.point_type = builder.point_type;
        this.current_point = builder.current_point;
        this.next_point = builder.next_point;
    }
}
