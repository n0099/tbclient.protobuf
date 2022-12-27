package tbclient.BazhuGrade;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class GradeDesc extends Message {
    public static final String DEFAULT_GRADE = "";
    public static final Integer DEFAULT_POINT = 0;
    public static final List<GradeRight> DEFAULT_RIGHTS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String grade;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer point;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GradeRight> rights;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GradeDesc> {
        public String grade;
        public Integer point;
        public List<GradeRight> rights;

        public Builder() {
        }

        public Builder(GradeDesc gradeDesc) {
            super(gradeDesc);
            if (gradeDesc == null) {
                return;
            }
            this.grade = gradeDesc.grade;
            this.point = gradeDesc.point;
            this.rights = Message.copyOf(gradeDesc.rights);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GradeDesc build(boolean z) {
            return new GradeDesc(this, z);
        }
    }

    public GradeDesc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.grade;
            if (str == null) {
                this.grade = "";
            } else {
                this.grade = str;
            }
            Integer num = builder.point;
            if (num == null) {
                this.point = DEFAULT_POINT;
            } else {
                this.point = num;
            }
            List<GradeRight> list = builder.rights;
            if (list == null) {
                this.rights = DEFAULT_RIGHTS;
                return;
            } else {
                this.rights = Message.immutableCopyOf(list);
                return;
            }
        }
        this.grade = builder.grade;
        this.point = builder.point;
        this.rights = Message.immutableCopyOf(builder.rights);
    }
}
