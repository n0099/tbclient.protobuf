package tbclient;

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
/* loaded from: classes9.dex */
public final class GradePoint extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CURRENT_POINT;
    public static final Integer DEFAULT_NEXT_POINT;
    public static final String DEFAULT_POINT_NAME = "";
    public static final Integer DEFAULT_POINT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer current_point;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer next_point;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String point_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer point_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GradePoint> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer current_point;
        public Integer next_point;
        public String point_name;
        public Integer point_type;

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
        public Builder(GradePoint gradePoint) {
            super(gradePoint);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gradePoint};
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
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GradePoint(this, z, null) : (GradePoint) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1080400952, "Ltbclient/GradePoint;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1080400952, "Ltbclient/GradePoint;");
                return;
            }
        }
        DEFAULT_POINT_TYPE = 0;
        DEFAULT_CURRENT_POINT = 0;
        DEFAULT_NEXT_POINT = 0;
    }

    public /* synthetic */ GradePoint(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradePoint(Builder builder, boolean z) {
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
