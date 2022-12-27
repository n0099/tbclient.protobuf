package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GradePoint;
/* loaded from: classes9.dex */
public final class BazhuGrade extends Message {
    public static final String DEFAULT_ESTIMATION_LEFT_TEXT = "";
    public static final String DEFAULT_GRADE = "";
    public static final String DEFAULT_GRADE_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String estimation_left_text;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer estimation_left_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String grade;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GradePoint> grade_point;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String grade_text;
    public static final List<GradePoint> DEFAULT_GRADE_POINT = Collections.emptyList();
    public static final Integer DEFAULT_ESTIMATION_LEFT_TIME = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BazhuGrade> {
        public String estimation_left_text;
        public Integer estimation_left_time;
        public String grade;
        public List<GradePoint> grade_point;
        public String grade_text;

        public Builder() {
        }

        public Builder(BazhuGrade bazhuGrade) {
            super(bazhuGrade);
            if (bazhuGrade == null) {
                return;
            }
            this.grade = bazhuGrade.grade;
            this.grade_point = Message.copyOf(bazhuGrade.grade_point);
            this.estimation_left_text = bazhuGrade.estimation_left_text;
            this.grade_text = bazhuGrade.grade_text;
            this.estimation_left_time = bazhuGrade.estimation_left_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BazhuGrade build(boolean z) {
            return new BazhuGrade(this, z);
        }
    }

    public BazhuGrade(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.grade;
            if (str == null) {
                this.grade = "";
            } else {
                this.grade = str;
            }
            List<GradePoint> list = builder.grade_point;
            if (list == null) {
                this.grade_point = DEFAULT_GRADE_POINT;
            } else {
                this.grade_point = Message.immutableCopyOf(list);
            }
            String str2 = builder.estimation_left_text;
            if (str2 == null) {
                this.estimation_left_text = "";
            } else {
                this.estimation_left_text = str2;
            }
            String str3 = builder.grade_text;
            if (str3 == null) {
                this.grade_text = "";
            } else {
                this.grade_text = str3;
            }
            Integer num = builder.estimation_left_time;
            if (num == null) {
                this.estimation_left_time = DEFAULT_ESTIMATION_LEFT_TIME;
                return;
            } else {
                this.estimation_left_time = num;
                return;
            }
        }
        this.grade = builder.grade;
        this.grade_point = Message.immutableCopyOf(builder.grade_point);
        this.estimation_left_text = builder.estimation_left_text;
        this.grade_text = builder.grade_text;
        this.estimation_left_time = builder.estimation_left_time;
    }
}
