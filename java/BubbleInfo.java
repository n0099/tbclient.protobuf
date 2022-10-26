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
public final class BubbleInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BUBBLE_ID;
    public static final String DEFAULT_BUBBLE_PIC = "";
    public static final String DEFAULT_BUBBLE_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer bubble_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bubble_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bubble_text;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer bubble_id;
        public String bubble_pic;
        public String bubble_text;

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
        public Builder(BubbleInfo bubbleInfo) {
            super(bubbleInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bubbleInfo};
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
            if (bubbleInfo == null) {
                return;
            }
            this.bubble_id = bubbleInfo.bubble_id;
            this.bubble_text = bubbleInfo.bubble_text;
            this.bubble_pic = bubbleInfo.bubble_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BubbleInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BubbleInfo(this, z, null);
            }
            return (BubbleInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1923574537, "Ltbclient/BubbleInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1923574537, "Ltbclient/BubbleInfo;");
                return;
            }
        }
        DEFAULT_BUBBLE_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleInfo(Builder builder, boolean z) {
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
            Integer num = builder.bubble_id;
            if (num == null) {
                this.bubble_id = DEFAULT_BUBBLE_ID;
            } else {
                this.bubble_id = num;
            }
            String str = builder.bubble_text;
            if (str == null) {
                this.bubble_text = "";
            } else {
                this.bubble_text = str;
            }
            String str2 = builder.bubble_pic;
            if (str2 == null) {
                this.bubble_pic = "";
                return;
            } else {
                this.bubble_pic = str2;
                return;
            }
        }
        this.bubble_id = builder.bubble_id;
        this.bubble_text = builder.bubble_text;
        this.bubble_pic = builder.bubble_pic;
    }

    public /* synthetic */ BubbleInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
