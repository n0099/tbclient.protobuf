package tbclient.SimpleData;

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
public final class EncourageInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_COMMENTS;
    public static final Integer DEFAULT_DOWNLOADS;
    public static final Integer DEFAULT_SCORE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer comments;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer downloads;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer score;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer comments;
        public Integer downloads;
        public Integer score;

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
        public Builder(EncourageInfo encourageInfo) {
            super(encourageInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {encourageInfo};
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
            if (encourageInfo == null) {
                return;
            }
            this.downloads = encourageInfo.downloads;
            this.comments = encourageInfo.comments;
            this.score = encourageInfo.score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EncourageInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new EncourageInfo(this, z, null);
            }
            return (EncourageInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(651704873, "Ltbclient/SimpleData/EncourageInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(651704873, "Ltbclient/SimpleData/EncourageInfo;");
                return;
            }
        }
        DEFAULT_DOWNLOADS = 0;
        DEFAULT_COMMENTS = 0;
        DEFAULT_SCORE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncourageInfo(Builder builder, boolean z) {
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
            Integer num = builder.downloads;
            if (num == null) {
                this.downloads = DEFAULT_DOWNLOADS;
            } else {
                this.downloads = num;
            }
            Integer num2 = builder.comments;
            if (num2 == null) {
                this.comments = DEFAULT_COMMENTS;
            } else {
                this.comments = num2;
            }
            Integer num3 = builder.score;
            if (num3 == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = num3;
                return;
            }
        }
        this.downloads = builder.downloads;
        this.comments = builder.comments;
        this.score = builder.score;
    }

    public /* synthetic */ EncourageInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
