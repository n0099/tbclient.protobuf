package tbclient.BazhuGrade;

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
/* loaded from: classes4.dex */
public final class GradeDesc extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_GRADE = "";
    public static final Integer DEFAULT_POINT;
    public static final List<GradeRight> DEFAULT_RIGHTS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String grade;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer point;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GradeRight> rights;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GradeDesc> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String grade;
        public Integer point;
        public List<GradeRight> rights;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(GradeDesc gradeDesc) {
            super(gradeDesc);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gradeDesc};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
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
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GradeDesc(this, z, null) : (GradeDesc) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(361415529, "Ltbclient/BazhuGrade/GradeDesc;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(361415529, "Ltbclient/BazhuGrade/GradeDesc;");
                return;
            }
        }
        DEFAULT_POINT = 0;
        DEFAULT_RIGHTS = Collections.emptyList();
    }

    public /* synthetic */ GradeDesc(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradeDesc(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
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
