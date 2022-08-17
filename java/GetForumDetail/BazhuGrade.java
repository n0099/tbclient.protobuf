package tbclient.GetForumDetail;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GradePoint;
/* loaded from: classes9.dex */
public final class BazhuGrade extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ESTIMATION_LEFT_TEXT = "";
    public static final Integer DEFAULT_ESTIMATION_LEFT_TIME;
    public static final String DEFAULT_GRADE = "";
    public static final List<GradePoint> DEFAULT_GRADE_POINT;
    public static final String DEFAULT_GRADE_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BazhuGrade> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String estimation_left_text;
        public Integer estimation_left_time;
        public String grade;
        public List<GradePoint> grade_point;
        public String grade_text;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(BazhuGrade bazhuGrade) {
            super(bazhuGrade);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bazhuGrade};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
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
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BazhuGrade(this, z, null) : (BazhuGrade) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-700692957, "Ltbclient/GetForumDetail/BazhuGrade;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-700692957, "Ltbclient/GetForumDetail/BazhuGrade;");
                return;
            }
        }
        DEFAULT_GRADE_POINT = Collections.emptyList();
        DEFAULT_ESTIMATION_LEFT_TIME = 0;
    }

    public /* synthetic */ BazhuGrade(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BazhuGrade(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
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
