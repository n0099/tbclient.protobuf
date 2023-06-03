package tbclient.BazhuGrade;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GradeRight extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GradeRight> {
        public String desc;
        public String image;
        public String name;

        public Builder() {
        }

        public Builder(GradeRight gradeRight) {
            super(gradeRight);
            if (gradeRight == null) {
                return;
            }
            this.image = gradeRight.image;
            this.name = gradeRight.name;
            this.desc = gradeRight.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GradeRight build(boolean z) {
            return new GradeRight(this, z);
        }
    }

    public GradeRight(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.image;
            if (str == null) {
                this.image = "";
            } else {
                this.image = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str3;
                return;
            }
        }
        this.image = builder.image;
        this.name = builder.name;
        this.desc = builder.desc;
    }
}
